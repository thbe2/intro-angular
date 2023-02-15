# Affichage d'une liste

- Dans le dossier `src/app/`, créez un fichier appelé `mock-chicken.ts` et définissez-y une **constante CHICKENS** étant un **tableau** d'objet de type `Chicken`

```typescript
import { Chicken } from './chicken';

export const CHICKENS: Chicken[] = [
  {
    id: 1,
    name: 'Ginger',
    colour: 'orange',
    picture: 'assets/img/my-meiker-1676367888800390.png',
  },
  // ... add other chickens
];
```

- Copiez le style css du fichier [chickens.component.css](chickens.component.css)
- Retournez dans la **classe ChickensComponent**, importez le **tableau CHICKENS** que vous venez de créer, et remplacez **l'attribut chicken** par un nouvel attribut nommé `chickens` prenant en valeur ce tableau
- Modifiez le **template ChickensComponent** (`chickens.component.html`) afin d'afficher toutes les poules en omettant **l'attribut colour** (gardez le contenu actuel du template de côté)
  - l'image (attribut `picture`) est à placer entre l'id et le nom
  - la taille conseillée pour l'image est de 20x20 pixels
- La structure (à compléter) de votre template doit ressembler à cela :

```typescript
<h2>My Chickens</h2>
<ul class="chickens">
  <li *ngFor="[for loop]">
    <span class="badge">[id]</span>
    <img [img attributes] />
    [name]
  </li>
</ul>
```

- Ajoutez un bouton englobant tous les attributs affichés dans la liste
- Ajoutez l'évènement au clic appelant une fonction nommée `onSelect` à laquelle vous passez en paramètre la poule sélectionnée

```typescript
<li *ngFor="[for loop]">
  <button type="button" ([event name])="[function call]">
  <!-- ... -->
```

- Dans la **classe ChickensComponent** ajoutez :
  - **l'attribut selectedChicken** de type `Chicken`
  - la **fonction onSelect** affectant la poule passée en paramètre à **l'attribut selectedChicken**
- Dans le **template ChickensComponent**, reprenez le contenu précédemment mis de côté et faites en sorte qu'il s'affiche dans le cas où une poule est sélectionnée uniquement (affichage des détails de la poule sélectionnée)
- Ajoutez au bouton l'attribut suivant, permettant de changer le style de ce dernier lorsqu'il est sélectionné :

```typescript
[class.selected]="chicken === selectedChicken"
```
