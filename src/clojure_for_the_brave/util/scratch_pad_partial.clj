(ns clojure-for-the-brave.util.partial)

(def add10 (partial * 10))

(add10 4 3)

(defn my-partial
  [func & args]
  (fn [& more-args]
    (apply func (into args more-args))))

(def mul10 (my-partial * 10))

(println (mul10 3 3))



;; Real use is to remove some arguments if they are very commonly used. Eg.
;; (my-log-function :warn "Message")  I use warn argument a lot, so I want
;; (warn "Message"), to do this:

(defn lousy-logger
  [log-level message]
  ;; condp like switch statements
  (condp = log-level
    :warn (clojure.string/lower-case message)
    :emergency (clojure.string/upper-case message)))


;; Using this
(def warn (partial lousy-logger :warn))


;; This
(warn "Red light ahead")
;; Is equivalent to this
(lousy-logger :warn "Red light ahead")
