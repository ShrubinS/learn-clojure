(ns clojure-for-the-brave.util.scratch-pad-loop)

;; Looping a variable and inserting its value into an array

(def myLoop
  (loop [x 0
         remaining []]
    (if (> x 3)
      remaining
      (do (println x "Value of x")
          (println remaining "Value of remaining")
          (recur (inc x)
                 (into remaining [x]))))))


;; Simple loop taking two parameters

;; (loop [x 0
;;        y 0]
;;   (println x "Value of x")
;;   (println y "Value of y")
;;   (if (< x 3)
;;       (recur (inc x)
;;              (dec y))
;;       ))