(ns sicp.code-breaker)

(defn break-code [past-guesses] [0 0 0 0])

(defn score [code guess]
  (filter some? (map #(if (= %1 %2) :pos) code guess)))