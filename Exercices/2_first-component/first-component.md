# Premier composant

- Depuis votre **console**, tapez la commande suivante :

```bash
ng generate component chickens
```

- Vous devriez voir apparaitre un nouveau dossier du nom de votre composant
- Ajoutez à votre **classe ChickensComponent** la propriété suivante:
  - chicken: `string`
- Attribuez une valeur à cette propriété et affichez-la dans le **template du composant**
- Dans le template du **composant app**, ajoutez le **composant ChickensComponent** juste en-dessous du titre
- Créez une **interface Chicken** (`src/app/chicken.ts`) ayant les propriétés suivantes :

  - id: `number`
  - name: `string`
  - colour: `string`
  - picture: `string`

- Pour chaque poule créée, il vous faudra créer une image de cette dernière. Rendez-vous au lien suivant pour faire parler vos talents d'artiste : https://meiker.io/play/13152/online.html
- Une fois votre poule générée, téléchargez-là
- Dans votre **projet angular-chicken-coop**, créez les dossiers `assets` (s'il n'est pas déjà présent) et `img` de sorte à avoir le chemin suivant : `src/assets/img`
- Vous enregistrerez toutes vos images de poule dans le dossier `img`
- Dans la **classe ChickensComponent** créez une poule (un peu d'inspiration : https://chickenrun.fandom.com/wiki/Category:Characters). La **propriété picture** prendra pour valeur le chemin vers l'image enregistrée. Exemple :

```typescript
chicken: Chicken = {
  id: 1,
  name: 'Ginger',
  colour: 'orange',
  picture: 'assets/img/my-meiker-1676367888800390.png',
};
```

- Affichez maintenant les détails concernant la poule créée dans le **template ChickensComponent** (`chickens.component.html`) en veillant aux points suivants :
  - Dans le titre (`<h2>`) de votre template, utilisez un pipe pour afficher le nom en majuscule
  - Reprenez la propriété `name` et faites en sorte qu'elle soit modifiable
  - Servez-vous de la balise `<img />` pour afficher la propriété `picture` (taille convenable : 256x256)
- Importer le **module FormsModule** dans le fichier `app.module.ts`
- Déclarez, si ce n'est pas déjà fait, votre **composant ChickensComponent** dans le fichier `app.module.ts`
