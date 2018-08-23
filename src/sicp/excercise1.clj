(ns sicp.excercise1)

(def a 3)

(def b (+ a 1))

(defn squareSum [a b c] (+ (* (max a b) (max a b)) (* (max a c) (max a c))))

(defn a-plus-abs-b [a b] ((if (> b 0) + -) a b))

(defn p [] (p))

(defn test-p [x y] (if (= x 0) 0 y))

(defn (new-if [predi then-clause else-clause] (cond predi then-clause :else else-clause)))