iutvalence-projetS2-2013-2014-groupe11
======================================

Projet du semestre 2 du groupe 11

======================================

# Projets tutorés  S2
# Application Orientée Objet


## Objectif du projet
Le projet du second semestre consiste à créer une application Java afin d’utiliser nos connaissances apprises lors des cours, et les mettre en application.

## Choix du sujet
Après une concertation au sein de notre groupe, nous avons conclu que l’application à créer sera un jeu d’aventure, incluant des combats entre robots.

## Résultats attendus
L’environnement du jeu est une carte où un humain, le héros, se déplace case par case.
Un homme peut contrôler un à trois robots qu’il fait combattre contre d’autres robots appartenant à d’autres personnages.
Le but du jeu est de gagner des combats pour avoir des pièces et ainsi acheter de nouveaux robots ou améliorer l’état des robots. 

## Combats : 
Les combats se déroulent en tour par tour.
Un humain ne peut faire combattre que 3 robots au maximum, il dirige une équipe de 3 robots mais le combat se déroule en 1Vs1.
Nous discernons deux types d’adversaires :
* •	Ceux dont le combat est facultatif, ré-affrontables à l'infini.
* •	Ceux qui nous interceptent lors de notre aventure, affrontables une seule fois.

## Victoire :
La victoire permet au robot de gagner une étoile et le héros gagne 1 à 5 pièces selon la difficulté de l’équipe adverse.
La victoire permet aussi d’améliorer l’affinité entre le robot et son possesseur.

## Défaite :
La défaite engendre la perte d’une à plusieurs pièces que possède le héros.
De plus, la défaite provoque la diminution de l’affinité entre le robot et le héros.

## Batterie :
Le niveau de batterie détermine la puissance du robot lors des combats. En effet, plus la batterie du robot est pleine, plus ses dégâts sont importants.

### La batterie comporte 10 niveaux :
Niveau de la Batterie	Batterie (en %)	Dégâts

* 0	0	Dégâts * 0.00
* 1	20	Dégâts * 0.10
* 2	30	Dégâts * 0.25
* 3	40	Dégâts * 0.50
* 4	50	Dégâts * 0.75
* 5	60	Dégâts * 1.00
* 6	70	Dégâts * 1.25
* 7	80	Dégâts * 1.50
* 8	90	Dégâts * 2.00
* 9	100	Dégâts * 3.00


Lorsque la batterie du robot est vide, il faut la recharger, nous pouvons le déposer à deux endroits :
* •	À la maison, où la recharge s’effectue lentement.
* •	Auprès d'un mécanicien, où la recharge est plus intense et rapide

## Capacités des robots :
Les robots ont plusieurs capacités : la puissance, la vitesse et l’endurance :
* •	Puissance : Plus le robot est puissant, plus l’ennemi subira de dégâts.
* •	Vitesse : Plus le robot est rapide, plus il a de chances d’attaquer en premier lors des combats
* •	Endurance : Plus le robot est endurant, moins il subit de dégâts

Pour augmenter une capacité, il faut un certain nombre d’étoiles : 10 pour la puissance, 8 pour la vitesse, et 5 pour l’endurance
Chaque capacité a une limite : 100 points. (Pour augmenter la capacité puissance à 100, il faudra donc 10 000 étoiles). L’utilisateur choisit la capacité à augmenter à tout moment.

## Affinité : 
L’affinité détermine, en partie, la résistance des robots. Plus l’affinité entre le robot et son propriétaire est élevée, plus le robot est résistant aux attaques ennemies. Il s’agit d’une valeur entre 0 et 100 points
L’affinité augmente d’un point par combat gagné, et diminue de deux points par combat perdu.

## Nouveau robot :
On peut acquérir un nouveau robot en échangeant des pièces (bras mécanique, écrou, vis...) auprès d'un mécanicien.
À l’achat d’un robot, l’affinité est de 50 points.
