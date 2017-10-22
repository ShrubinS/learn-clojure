(ns clojure-for-the-brave.util.hobbit-reduce
  (:require [clojure-for-the-brave.util.hobbit-symmetrizer :as hs]))

(defn reduce-fn [final-parts part]
  (into final-parts (set [part (hs/match-part part)])))

(defn reduce-symmetrizer
  [body-parts]
  (reduce reduce-fn []
          body-parts))

(reduce-symmetrizer hs/asym-hobbit-body-parts)

