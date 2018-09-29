(ns sicp.excercise1)

(def a 3)

(def b (+ a 1))

(defn squareSum [a b c] (+ (* (max a b) (max a b)) (* (max a c) (max a c))))

(defn a-plus-abs-b [a b] ((if (> b 0) + -) a b))

(defn p [] (p))

(defn test-recur [x y] (if (= x 0) 0 y))

(defn abs [n] (max n (- n)))

(defn average [x y] (/ (+ x y) 2))

(defn improve [guess x] (average guess (/ x guess)))

(defn square [x] (* x x))

(defn good-enough? [guess x] (< (abs (- (square guess) x)) 0.0000001))

(defn sqrt-iter [guess x] (if (good-enough? guess x) guess (sqrt-iter (improve guess x) x)))

(defn sqrt [x] (sqrt-iter 1.0 x))
