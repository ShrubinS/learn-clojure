(ns clojure-for-the-brave.util.lazy-seq)

; Really important example on lazy sequences.
; creates (0 (lazy-seq fn(2))),
; (0 2 (lazy-seq fn(4))) and so on...

(defn even-numbers
  ([] (even-numbers 0))
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(take 10 (even-numbers))
