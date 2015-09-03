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


;Hobbit exercise

(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])



















