(ns solutions_4clojure.easy)

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
  (reduce (fn [i,items] (inc i)) 0 items))

(countseq [1 2 3 4 5 6 5 6 3])
(countseq-recur [1 2 3 4 5 6 5 6 3,6,7])

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
  (loop [x items i (count items) sum 0]
    (if (<= i 0)
      sum
      (recur (rest x) (dec i) (+ sum (first x))))))
(sumup [1 2 5 6 8])

;; still working on this problem
;; Problem 25, Find the odd numbers 
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))
(defn find-odd [items]
  (loop [x items i (count items) newitems []]
    (if (<= i 0)
      newitems
      (recur(rest x)(dec i)(conj newitems odd? (first x)))
      )
  )
   )
(find-odd [1 5 7 8 6 4])

;; Problem 47, Contain Yourself 
;; (contains? #{4 5 6} __)
;; (contains? [1 1 1 1 1] __)
;; (contains? {4 :a 2 :b} __)
;; (not (contains? [1 2 4] __))
4

