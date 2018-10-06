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
    (score [0 0 0 0] [1 1 1 1]) => [])

  (fact
    "score guess with one :pos match"
    (score [0 0 0 0] [0 1 1 1 ]) => [:pos]
    )

  (fact
    "guess with two :pos matches"
    (score [0 0 0 0] [0 1 1 0]) => [:pos :pos])

  )