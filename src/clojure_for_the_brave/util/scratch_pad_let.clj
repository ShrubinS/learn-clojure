(ns clojure-for-the-brave.util.scratch-pad-let
  (:require [clojure-for-the-brave.util.scratch_pad_loop :as spl]))

(println "THIS... IS... MYLOOOPPP" spl/myLoop)

(def letLoop
  (let [[first & rest] spl/myLoop]
    (println "first" first "rest" rest)))


(println letLoop)