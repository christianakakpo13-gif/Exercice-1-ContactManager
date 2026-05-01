# ContactManager — Gestionnaire de contacts

> Exercice 1 — Chapitre 06 : Programmation Orientée Objet en Java  

---

## Description

Application Java qui permet de **gérer une liste de contacts** (nom + numéro de téléphone).  
Elle illustre les concepts fondamentaux de la POO : classes, objets, attributs, méthodes et constructeurs.

---

## Fonctionnalités

- Créer des contacts avec un nom et un numéro de téléphone
- Ajouter des contacts dans un gestionnaire (tableau de 500 places)
- Rechercher un contact par son nom exact
- Afficher la liste complète des contacts enregistrés

---

## Structure du projet

```
ContactsManager/
├── src/
│   ├── Contact.java          # Classe représentant un contact
│   ├── ContactsManager.java  # Gestionnaire (ajout + recherche)
│   └── Main.java             # Point d'entrée du programme
└── README.md
```

---

## Prérequis

| Outil    | Version minimale |
|----------|-----------------|
| Java JDK | 21              |
| IntelliJ | toute version   |

---

## Comment exécuter

### Avec IntelliJ IDEA
1. Ouvrir IntelliJ → **File > Open** → sélectionner le dossier `ContactsManager`
2. Faire un clic droit sur `Main.java` → **Run 'Main.main()'**

### Avec le terminal
```bash
cd src
javac Contact.java ContactsManager.java Main.java
java Main
```

---

## Exemple de sortie

```
=== Liste des contacts (5) ===
1. Alice Dupont — 0701234567
2. Bob Martin — 0712345678
3. Chloé Bernard — 0723456789
4. David Kouassi — 0734567890
5. Emma Traoré — 0745678901

--- Recherche de 'Chloé Bernard' ---
Contact trouvé !
Nom    : Chloé Bernard
Tél    : 0723456789

--- Recherche de 'Inconnu' ---
Contact introuvable dans le gestionnaire.
```

---

## Pourquoi `String` pour le numéro de téléphone ?

Un numéro comme `0701234567` commence par `0`.  
Un `int` supprimerait ce zéro initial → `701234567`.  
De plus, un numéro à 10 chiffres dépasse la capacité d'un `int` (max ~2,1 milliards).  
`String` est donc le type approprié pour les numéros de téléphone.

---

## Auteur

Étudiant AKAKPO CHRISTIAN LPRGL3B
