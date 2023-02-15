# Composant fonctionnel

- Générez un **composant chicken-detail**
- Un dossier `src/app/chicken-detail` a été créé
- Dans le **template ChickenDetailComponent** reprenez la partie d'affichage de la poule sélectionnée (toute la `div`), remplacez `selectedChicken` par `chicken` et ajoutez les éléments suivants pour l'affichage de l'image :

```html
<img
  src="{{ chicken.picture }}"
  alt="A chicken named {{ chicken.name }}"
  height="256"
  width="256"
  onclick="document.getElementById('chickensound').play();"
/>
<audio
  id="chickensound"
  src="https://www.google.com/logos/fnbx/animal_sounds/chicken.mp3"
></audio>
```

- Dans la **classe ChickenDetailComponent**, importez le décorateur `@Input()`

```typescript
import { Component, Input } from '@angular/core';
```

- Ajoutez une propriété chicken de la façon suivante :

```typescript
@Input() chicken?: Chicken;
```

- Dans le **template ChickensComponent**, remplacez la partie d'affichage de la poule sélectionnée (toute la `div`) par la ligne suivante :

```html
<app-chicken-detail [chicken]="selectedChicken"></app-chicken-detail>
```
