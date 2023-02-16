# Réception des données du serveur

- Pour le bon déroulé de cet exercice, référez vous au tutoriel (https://angular.io/tutorial/tour-of-heroes/toh-pt6)
- Pour la partie serveur, vous pouvez :
  - Créer une API virtuelle (https://angular.io/tutorial/tour-of-heroes/toh-pt6#simulate-a-data-server)
  - Créer un serveur JSON (https://github.com/typicode/json-server)
  - Créer une API Spring ([demo-angular](../../Demonstrations/demo-angular/))
- Dans le **module AppModule**:
  - Importez le module `HttpClientModule` et ajoutez-le aux imports
- Dans le **service ChickenService** :
  - Procédez aux imports ci-dessous
  ```typescript
  import { HttpClient, HttpHeaders } from '@angular/common/http';
  ```
  - Injectez les dépendances via le constructeur
  - Créez une fonction `log(message: string)` dans laquelle vous ferez appel à la fonction `add(message: string)` de **MessageService**
  - Créez une propriété `chickensUrl` en lui affectant l'URL de votre API
- Dans la **classe ChickenService** :
  - Modifiez la fonction `getChickens()` et utilisez le module `HttpClientModule` pour faire une requête de type `GET` sur l'URL de l'API
  - Ajoutez un gestion de erreurs
  - Utilisez la fonction `tap()` pour logguer les opérations
  - Modifez de la même manière la fonction `getChicken(id: number)`
  - Ajoutez l'attribut suivant :
  ```typescript
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
  };
  ```
  - Créez une fonction `updateChicken(chicken: Chicken): Observable<any>` en utilisant la méthode `PUT` du **module http**
  - Créez une fonction `addChicken(chicken: Chicken): Observable<any>` en utilisant la méthode `PUT` du **module http**
  - Créez une fonction `delete(chicken: Chicken): void` en utilisant la méthode `DELETE` du **module http**
- Dans le **template ChickenDetailComponent** :
  - Ajoutez un bouton appelant la fonction `save()` lorsque l'on clique dessus
- Dans la **classe ChickenDetailComponent** :
  - Créez la fonction `save()` faisant appel à la fonction `updateChicken()` du **service ChickenService**
- Dans le **template ChickensComponent** :
  - Créez une `<div>` dans laquelle vous ajouterez les entrées nécessaire à la création d'une poule ainsi qu'un bouton faisant appel à la fonction `add()` au clic sur ce dernier
  - Dans l'item de liste (`<li>`) affichant les données d'une poule, ajoutez un bouton faisant appel à la fonction `delete()` lorsque l'on clique dessus
- Dans la **classe ChickensComponent** :
  - Créez une fonction `add(name: string, color: string, picture: string): void` dans laquelle vous générerez une nouvelle poule et l'enregistrerez en base de données via l'appel de la fonction `addChicken()` du **service ChickenService**
  - Ajoutez également cette poule au tableau de poules actuel
  - Créez une fonction `delete(chicken: Chicken): void` supprimant la poule passée en paramètre via l'appel de la fonction `deleteChicken()` du **service ChickenService**
  - Supprimez également cette poule du tableau de poules actuel
