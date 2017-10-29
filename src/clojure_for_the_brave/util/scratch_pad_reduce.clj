(ns clojure-for-the-brave.util.scratch-pad-reduce)

; Using reduce to do stuff on map
(reduce (fn
          [modified-map [key value]]                        ; reduce converts {{}, {}} to ([],[])
          (assoc modified-map key (+ value 1)))
        {}
        {:a 20 :b 30})                                      ; returns {:a 21 :b 31}

; Using reduce to filter stuff
(reduce (fn
          [modified-map [key value]]
          (if (> value 20)
            (assoc modified-map key value)))
        {}
        {:a 20 :b 30})                                      ; returns {:b 30}
