(ns clojure-for-the-brave.util.add-number)

(defn addNum
  "Adds number 100 to argument"
  [arg]
  (+ 100 arg))

(println (addNum 44) (addNum 23) (addNum 88))
