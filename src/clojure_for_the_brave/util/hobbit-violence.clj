(ns clojure-for-the-brave.util.hobbit-violence
  (:require [clojure-for-the-brave.util.hobbit-reduce :as hr])
  (:require [clojure-for-the-brave.util.hobbit-symmetrizer :as hs]))


(defn hit-hobbit
  [asym-body-parts]
  (let [sym-parts (hr/reduce-symmetrizer asym-body-parts)
        max-damage (reduce + (map :size sym-parts))
        target (rand max-damage)]
    (loop [[part & remaining] sym-parts
           accumulated-damage (:size part)] ;; This is initial value. Next, you give
      (if (> accumulated-damage target)
        part
        (recur remaining (+ accumulated-damage (:size (first remaining))))))))

(hit-hobbit hs/asym-hobbit-body-parts)
