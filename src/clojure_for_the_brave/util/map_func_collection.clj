(ns clojure-for-the-brave.util.map-func-collection)

(def sum #(reduce + %))

(def avg #(/ (sum %) (count %)))

(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))

(defn stats-verbose
  [numbers]
  (map (fn [function]                                       ;numbers available cuz closure
         (function numbers)) [sum count avg]))


(stats-verbose [3 4 10])
