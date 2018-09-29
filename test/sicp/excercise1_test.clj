(ns sicp.excercise1-test
  (:require [clojure.test :refer :all]
            [sicp.excercise1 :refer :all]
            [midje.sweet :refer :all]))

(facts "sicp excercise 1.1"
       (fact "1" 10 => 10)
       (fact "2" (+ 5 3 4) => 12)
       (fact "3" (- 9 1) => 8)
       (fact "4" (/ 6 2) => 3)
       (fact "5" (+ (* 2 4) (- 4 6)) => 6)
       (fact "6" a => 3)
       (fact "7" b => 4)
       (fact "8" (+ a b (* a b)) => 19)
       (fact "9" (= a b) => false)
       (fact "10" (if (and (> a b) (< b (* a b))) a b) => 4)
       (fact "11" (cond (= a 4) 6 (= b 4) (+ 6 7 a) :else 25) => 16)
       (fact "12" (+ 2 (if (> b a) b a) a b) => 13)
       (fact "13" (* (cond (> a b) a (< a b) b :else -1) (+ a 1)) => 16)
       )

(facts "sicp excercise 1.2"
       (fact "translate into prefix form" (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (- 6 2) (- 2 7))) =>  -37/150)
       )

(facts "sicp excercise 1.3"
       (fact "sum square of two larger numbers" (squareSum 4 5 0) => 41)
       (fact "sum square of two larger numbers" (squareSum 4 0 5) => 41)
       (fact "sum square of two larger numbers" (squareSum 4 3 5) => 41)
       (fact "sum square of two larger numbers" (squareSum 1 2 3) => 13)
       )

(fact "sicp excercise 1.4"
      (fact "observe model 1" (a-plus-abs-b 0 0) => 0 )
      (fact "observe model 2" (a-plus-abs-b 1 0) => 1 )
      (fact "observe model 3" (a-plus-abs-b 1 1) => 2 )
      (fact "observe model 4" (a-plus-abs-b -1 0) => -1 )
      (fact "observe model 5" (a-plus-abs-b -1 1) => 0 )
      (fact "observe model 6" (a-plus-abs-b -1 -1) => 0 )
      (fact "observe model 7" (a-plus-abs-b -2 -1) => -1 )
      )

(fact "sicp excercise 1.5"
      (fact "recursive call throws exception" (test-recur 0 (p)) => (throws StackOverflowError) )
      )

(fact "sicp excercise 1.7"
      (fact "average 1" (average 2 0) => 1)
      (fact "average 2" (average 3 0) => 3/2)
      (fact "improve 1" (improve 1 1) => 1)
      (fact "improve 2" (improve 1 2) => 3/2)
      (fact "improve 3" (improve 1 3) => 2)
      (fact "improve 4" (improve 3/2 2) => 17/12)
      (fact "improve 5" (improve 17/12 2) => 577/408)
      (fact "square 1" (square 1) => 1)
      (fact "square 2" (square 2) => 4)
      (fact "sqrt 1" (sqrt 4) => 2.000000000000002)
      (fact "sqrt 2" (sqrt 16) => 4.000000000000051)
      )
