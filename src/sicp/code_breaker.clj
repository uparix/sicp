(ns sicp.code-breaker)

(defn break-code [past-guesses] [0 0 0 0])

(defn position-matches [code guess]
  (count
    (filter identity
            (map #(= %1 %2) code guess))))

(defn score [code guess]
  [(position-matches code guess) 0])