(ns sicp.code-breaker-test
  (:require [clojure.test :refer :all]
            [sicp.code-breaker :refer :all]
            [midje.sweet :refer :all]))

(facts "Code Breaker"
       fact "initial guess"
       (break-code []) => [0 0 0 0])


(facts
  "code maker"
  (fact
    "score guess with no matches"
    (score [0 0 0 0] [1 1 1 1]) => [0 0])

  (fact
    "score guess with one position match"
    (score [0 0 0 0] [0 1 1 1 ]) => [1 0]
    )

  (fact
    "score guess with two positions match"
    (score [0 0 0 0] [0 1 1 0 ]) => [2 0]
    (score [0 0 0 0] [1 0 1 0 ]) => [2 0]
    (score [0 0 0 0] [0 1 0 1 ]) => [2 0]
    )


  (fact
    "guess with many position matches"
    (score [1 1 1 1] [0 1 1 1]) => [3 0]
    (score [0 0 0 0] [0 0 0 1]) => [3 0]
    (score [1 2 3 4] [1 2 3 4]) => [4 0]
    )

  )