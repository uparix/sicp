(ns sicp.pico)


(defn cards []
  (list 2 3 4 5 6 7 8 9 10 13 16)
  )

(defn points []
  (list 1 2 2 2 3 3 3 3 3 3 4)
  )

(def state-of-game (atom {:player1points 0 :player2points 0}))