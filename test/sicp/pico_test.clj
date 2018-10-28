(ns sicp.pico-test
  (:require [midje.sweet :refer :all]
            [sicp.pico :refer :all]
            ))
(comment
  "Contents:
  11 cards with face values (the large numbers) from 2 to 10,
  plus 13 and 16 and a point value (the small dots) from 1 to 4
  points.")

(comment
  "Game Idea:
  To collect the most points after a set of two rounds.")

(comment
  "Preparation:
  All cards are shuffled and dealt evenly. The extra card
  is put aside and not used during the game.")

(comment
  "Game Play:
  Both players secretly select a card from their hand and
  simultaneously reveal them. The card with the larger value
  wins, unless it is more than two times larger, in which
  case the smaller card wins. For example: the 10 beats the 5,
  but is beaten by the 4. The winning card remains in front of
  the player and counts towards his point total for the round.
  The losing card is placed back in the hand of the player who
  played it and can be used again in the round. This is repeated
  until one of the players has only one card left.")

(comment
  "Scoring:
  The players now total the points for all of the winning cards
  in front of them. Cards still in their hands count nothing.
  This score is noted and a second round is played.

  For the second round, the players exchange their sets of cards
  and play again following the same rules.

  After the two rounds, the player with the highest overall
  total points wins the game.")

(comment "To play with 3, two sets of Pico cards are required.")

(comment
  "Preparation:
  Two of the 2 cards and one of the 3 cards are removed from the
  deck. The remaining cards are then shuffled and dealt evenly.
  The extra card is placed off to the side face-up. The players
  examine the cards dealt to them and then give them to the player
  on their left.")

(comment
  "Game Play:
  The three players secretly select one of their cards and reveal
  them simultaneously. If two of the players reveal the same card,
  they both win. If there is no pair revealed, then the card with
  the highest value wins, unless it is larger than the sum of the
  other two cards, in which case the lowest card wins. The winning
  cards remain face up in front of the players and the losing cards
  are returned to the player's hands. The round ends when one of
  the players has only one card left.")

(comment
  "Scoring:
  The players now total the points for all of the winning cards in
  front of them. Cards still in their hands count nothing. This
  score is noted and a second round is played.
  The players give their sets of cards to their right hand neighbor
  and play again following the same rules. Whoever has the most
  points after 3 rounds, wins the game.")

 (facts
   "Pico Game"
   (fact "Get cards"
        (first (shuffle (cards))) => 2
         )
   )