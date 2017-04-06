(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "You lose!"))

(defn jogo [lives]
  (if (= lives 0)
    (perdeu)
    (do 
      (print lives)
      (jogo (dec lives))
    )
  )
)


(defn fib [x]
  (if (= x 0) 0
  (if (= x 1) 1
  (+ (fib (- x 1)) (fib (- x 2)))
  )
 )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
