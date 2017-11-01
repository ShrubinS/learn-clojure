(ns clojure-for-the-brave.util.scratch-pad-into-conj)

(println (into {:favorite-emotion "gloomy"} [[:sunlight-reaction "Glitter!"]]))

; The below are identical -- see how conj is related to into
; conj in terms of into
(defn my-conj
  [target & additions]
  (into target additions))

(println (my-conj [0] [1] 2 3))
(println (conj [0] [1] 2 3))
(println (into [0] '([1] 2 3)))


; into in terms of conj, using apply to "explode" it out of the structure
(defn my-into
  [target additions]
  (apply conj target additions))

(println (into [0] [1 2 3]))
(println (my-into [0] [1 2 3]))
