(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "start your engines"))
(println "cleanliness is next to godliness")
(defn train
  []
  (println "Choo choo!"))
(+ 1 (* 2 3) 4)


(if true
  "abra cadabra"
  "hocus pocus")
(defn i-like-food
   [food]
   (str "MMMMM, I love me some " food "!!!")
     )

(defn more-food
  [& foods]
  (map i-like-food foods))

(println (more-food "ice cream " "pizzza " "peanut butter jelly time"))
