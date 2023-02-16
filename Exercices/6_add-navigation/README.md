# Navigation et routage

- Générez un **module app-routing** avec la commande suivante :

```bash
ng generate module app-routing --flat --module=app
```

- Créer un routeur comportant une route `heroes` faisant référence au **composant HeroesComponent**
- Dans le **template AppComponent** :

  - Ajoutez la balise `<router-outlet></router-outlet>`
  - Ajoutez une navigation (`<nav>`) comportant un lien vers la route `/chickens`

- Générez un **composant dashboard**
- Dans le **classe DashboardComponent** :
  - Importez et injectez le **service ChickenService**
  - Ajoutez un attribut `chickens` étant un tableau de type `Chicken`, initialisé à un tableau vide
  - Créez une fonction `getChickens()` récupérant les poules via le **service ChickenService** et initialise le tableau `chickens` avec les 3 premières poules du tableau
  - Dans la fonction `ngOnInit()`, faites appel à la fonction `getChickens()`
- Dans le **template DashboardComponent** :
  - Affichez, sous le titre `Top Chickens`, la liste des poules contenue dans le tableau `chickens` dans une balise `<a>`
- Dans le **module AppRoutingModule** :
  - Ajoutez une route `dashboard` menant au **composant DashboardComponent**
  - Ajoutez une route vide redirigeant vers la route `/dashboard`
- Dans le **template AppComponent** :
  - Ajoutez une navigation (`<nav>`) comportant un lien vers la route `/dashboard` et un lien vers la route `/chickens`
- Dans le **module AppRoutingModule** :
  - Ajoutez une route `detail/:id` menant au **composant ChickenDetailComponent**
- Dans le **template DashboardComponent** :
  - Ajoutez dans la balise `<a>` l'attribut `routerLink` menant à la route `/detail/{{ chicken.id }}`
- Dans le **template ChickensComponent** :
  - Remplacez la balise `<button>` par une balise `<a>` contenant uniquement l'attribut `routerLink` menant à la route `/detail/{{ chicken.id }}`
  - Supprimez, si vous l'aviez utilisée, la balise `<span>` autour de `{{ chicken.name }}`
  - Supprimez la balise `<app-chicken-detail>`
- Dans la **classe chickensComponent** :
  - Supprimez la fonction `onSelect()`
  - Supprimez l'attribut `selectedChicken`
  - Supprimez le service `MessageService`
- Dans la **classe ChickenDetailComponent** :

  - Importez les services suivants :

  ```typescript
  import { ActivatedRoute } from '@angular/router';
  import { Location } from '@angular/common';

  import { ChickenService } from '../chicken.service';
  ```

  - Injectez leurs dépendances via le constructeur

- Dans le **service ChickenService** :
  - Créez une fonction `getChicken(id: number): Observable<Chicken>` retournant une poule en fonction de l'id récupéré en paramètre et inscrivant un message `ChickenService: fetched chicken id=${id}` via le **service messsageService**
- Dans la **classe ChickenDetailComponent** :
  - Ajoutez une fonction `getChicken(): void` affectant la valeur récupérée depuis le **service ChickenService** à l'attribut `chicken`
  - Appelez la fonction `getChicken(): void` dans la fonction `ngOnInit()`
- Dans le **template ChickenDetailComponent** :
  - Créez un bouton appelant la fonction `goBack()` lors d'un clic sur ce dernier
- Dans la **classe ChickenDetailComponent** :
  - Créez la fonction `goBack(): void` de la façon suivante :
  ```typescript
  goBack(): void {
    this.location.back();
  }
  ```
