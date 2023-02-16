# Ajout d'un service

## Premier service

- Générez un **service chicken**
- Dans votre **classe ChickenService**, créez une fonction `getChickens()` retournant le tableau CHICKENS importé depuis `mock-chicken`
- Dans la **classe ChickensComponent** :
  - Supprimez l'import du **tableau CHICKENS**
  - Importez le **service ChickenService**
  - Initialisez **l'attribut chickens** avec un tableau vide
  - Injectez le **service ChickenService** via le **constructeur**
  - Créez une méthode `getChickens()` initialisant **l'attribut chickens** en faisant appel à la fonction `getChickens()` du **service ChickenService**
  - Ajoutez la fonction `ngOnInit()` dans laquelle vous ferez appel à la fonction `getChickens()` que vous venez de créer
- Dans la **classe ChickenService** :

  - Procédez aux imports suivants :

    ```typescript
    import { Observable, of } from 'rxjs';
    ```

  - Modifiez la fonction `getChickens()` de sorte à ce qu'elle retourne un **observable**

- Dans la **classe ChickensComponent** :
  - Modifiez la fonction `getChickens()` de sorte à ce qu'elle souscrive à l'observable fournit par le **service ChickenService**

## Second service (optionnel)

- Générez un **composant messages**
- Dans le **template AppComponent** ajoutez le **composant MessagesComponent** avec la balise `<app-messages></app-messages>`
- Générez un **service messages**
- Dans la **classe MessageService** :
  - Ajoutez un **attribut messages** étant un tableau de **string** et initialiser-leà un tableau vide
  - Créez une **fonction** `add(message: string)` ajoutant un message dans le tableau de **l'attribut messages**
  - Créez une **fonction** `clear()` réinitialisant le tableau
- Dans la **classe ChickenService** :
  - Importez le **MessageService** et injectez les dépendances à ce service dans le constructeur
  - A chaque appel de la fonction `getChickens()`, le message `ChickenService: fetched chicken` doit être ajouté au tableau de messages (via l'appel de la fonction `add(message: string)`)
- Dans la **classe MessagesComponent** :
  - Importez le **MessageService** et injectez les dépendances à ce service dans le constructeur
- Dans le **template MessagesComponent** :
  - Affichez la liste de messages
  - Ajoutez une condition pour que l'affichage ne se fasse que lorsque le tableau de messages n'est pas vide
  - Ajoutez un bouton pour réinitialiser le tableau de messages (faisant appel à la fonction `clear()`)
- Dans la **classe ChickensComponent** :
  - Importez le **MessageService** et injectez les dépendances à ce service dans le constructeur
  - A chaque appel de la fonction `onSelect()`, le message `ChickensComponent: Selected chicken id=${chicken.id}` doit être ajouté au tableau de messages (via l'appel de la fonction `add(message: string)`)
