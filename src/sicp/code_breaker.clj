(ns sicp.code-breaker)

(defn break-code [past-guesses] [0 0 0 0])

(defn score [code guess]
  [(reduce + map #(if (= (first %) (second %)) 1 0) (partition 2 (interleave code guess)))])