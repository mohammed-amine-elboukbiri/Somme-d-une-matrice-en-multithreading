# 🧮 Matrice Multithread — Java

Projet Java illustrant le **calcul parallèle de la somme d'une matrice carrée** à l'aide de threads indépendants.

---

## 📋 Description

Une matrice de taille **n × n** est générée aléatoirement, puis affichée à l'écran. Chaque ligne de la matrice est traitée par un thread indépendant (`ThreadSom`) qui calcule la somme de ses éléments. Une fois tous les threads terminés, les sommes partielles sont agrégées pour obtenir la **somme globale** de la matrice.

---

## 🏗️ Structure du projet

```
MatriceMultithread/
├── src/
│   ├── Main.java           # Point d'entrée du programme
│   ├── ThreadSom.java      # Thread de calcul de somme par ligne
│   └── MatrixUtils.java    # Génération et affichage de la matrice
└── README.md
```

### Rôle de chaque classe

| Classe | Rôle |
|---|---|
| `Main` | Point d'entrée : initialise la matrice, lance les threads, affiche le résultat |
| `ThreadSom` | Thread qui calcule la somme des éléments d'une ligne donnée |
| `MatrixUtils` | Méthodes utilitaires : génération aléatoire et affichage de la matrice |

---

## ⚙️ Fonctionnement

```
Génération matrice n×n
        │
        ▼
Affichage de la matrice
        │
        ▼
Création d'un ThreadSom par ligne
        │
        ▼
Lancement de tous les threads (start)
        │
        ▼
Attente de fin de chaque thread (join)
        │
        ▼
Récupération des sommes partielles
        │
        ▼
Calcul et affichage de la somme globale
```

---


### Image de sortie

<img width="311" height="784" alt="affichage" src="https://github.com/user-attachments/assets/9c8ca379-89ef-4bce-938b-fd863891df83" />

---

## 🧵 Concepts illustrés

- **Création et démarrage de threads** avec `Thread` / `Runnable`
- **Synchronisation** via la méthode `join()` pour attendre la fin de chaque thread
- **Traitement parallèle** : chaque ligne est traitée indépendamment et simultanément
- **Organisation modulaire** d'un projet Java en plusieurs classes

---
