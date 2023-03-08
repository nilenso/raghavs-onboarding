(ns solutions_4clojure.easy)
(require '[clojure.string :as str])

;; Problem 19, Last Element 
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")
(defn lastelement [items]
  (first (reverse items)))
(lastelement [1 2 3 4])

;; Problem 20, Penultimate Element 
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])
(defn penultimate [items]
  (first (rest (reverse items))))

;; Problem 21, Nth Element 
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
(defn nthelement [items n]
  (loop [x n someitems items]
    (if (> x 0)
      (recur  (- x 1) (rest someitems))
      (first someitems))))
(nthelement [3 5 6 7] 3)

;; Problem 22, Count a Sequence 
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)
(defn countseq [items]
  (loop [x items i 0]
    (if (empty? x)
      i
      (recur (rest x) (inc i)))))

(defn countseq-recur [items]
  (reduce (fn [cnt item] (inc cnt)) 0 items))

(countseq [1 2 3 4 5 6 5 6 3])
(countseq-recur [1 2 3 4 5 6 5 6 3 6 7])

;; Problem 23, Reverse a Sequence
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])
(defn reverse-seq [items]
  (loop [x  items newitems [] i (count items)]
    (if (<= i 0)
      newitems
      (recur (take (dec i) x) (conj newitems (last x)) (dec i)))))

(reverse-seq [1 2 5 6 7])

;; Problem 24, Sum It All Up 
;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)
(defn sumup [items]
  (loop [x items sum 0]
    (if (empty? x)
      sum
      (recur (rest x) (+ sum (first x))))))
(sumup [1 2 5 6 8])

(defn sum-up [items]
  (reduce + 0 items))

(sum-up [1 2 3 4])

;; Problem 25, Find the odd numbers 
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))
(defn find-odd [items]
  (loop [x items newitems []]
    (if (empty? x)
      newitems
      (if (odd? (first x))
        (recur (rest x) (conj newitems (first x)))
        (recur (rest x) newitems)))))
(find-odd [1 5 2 7])

;; should try printing a sequence 
;; Problem 26, Fibonacci Sequence
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))



;; Problem 27, Palindrome Detector 
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))
(defn palindrome [st]
  (= (seq st) (reverse st)))
(palindrome "racecar")

;; still working on this problem
;; Problem 28, Flatten a Sequence 
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))
(defn flatten-list [lst]
  (if (not (empty? lst))
    (if (sequential? lst)
      (loop [items lst
             outlst []]
        (if (empty? items)
          outlst
           (if (sequential? (first items)) 
          (recur (first items) 
                 (conj outlst (first items)) 
                 ))))))
  
  (flatten-list [1 [4 5] 2 3]))

;; Problem 29, Get the Caps 
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")
(defn get-caps [st]
  (loop [items st newstr ""] 
      (if (empty? items)
        newstr
        (if (= (first items) (str/upper-case (first items)))
          (recur (rest items) (conj newstr (first items)))
          (recur (rest items) newstr)
        )
    )
  )) 
(get-caps "HeLlO, WoRlD!")

;; Problem 47, Contain Yourself 
;; (contains? #{4 5 6} __)
;; (contains? [1 1 1 1 1] __)
;; (contains? {4 :a 2 :b} __)
;; (not (contains? [1 2 4] __))
4

