(ns factorial)

(defn fact [n]
  (if (= n 0)
    1
    (* n (fact (dec n)))))

(defn run [opts]
  (println "factorial is "(fact 10))) 