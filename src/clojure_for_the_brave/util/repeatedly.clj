(ns clojure-for-the-brave.util.repeatedly)

(println (take 3 (repeatedly #(rand-int 10))))

(println (take 3 (repeatedly (fn [] (rand-int 10)))))
