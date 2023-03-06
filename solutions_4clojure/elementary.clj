(ns solutions_4clojure.elementary)

;; Problem 1, Nothing but the Truth
;;     (= __ true)
(= 4 4)

;; Problem 2, Simple Math
;; (= (- 10 (* 2 3)) __)
4

;; Problem 3, Strings 
;; (= __ (.toUpperCase "hello world"))
(.toUpperCase "hELlo World")

;; Problem 4, Lists
;; (= (list __) '(:a :b :c))
:a :b :c

;; Problem 5, conj on lists
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
'(1 2 3 4)

;; Problem 6, Vectors 
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
:a :b :c

;; Problem 7, conj on vectors 
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))
'(1 2 3 4)

;; Problem 8, Sets 
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
(set '(:a :b :c :d))

;; Problem 9, conj on sets 
;; (= #{1 2 3 4} (conj #{1 4 3} __))
2

;; Problem 10, Maps 
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))
20

;; Problem 11, conj on maps 
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
{:b 2}

;; Problem 12, Sequences 
;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))
3

;; Problem 13, rest 
;; (= __ (rest [10 20 30 40]))
'(20 30 40)

;; Problem 14, Functions 
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))
8

;; Problem 15, Double Down 
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)
*2

;; Problem 16, Hello World 
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")
(defn greet [message]
  (str "Hello, " message "!"))

;; Problem 17, map 
;; (= __ (map #(+ % 5) '(1 2 3)))
[6 7 8]

;; Problem 18, filter 
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))
[6 7]
