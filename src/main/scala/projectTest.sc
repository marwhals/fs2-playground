import fs2._

val s1 = Stream(1,2,3,4,5,6,7)
val s2 = Stream(4,5,6)
val nats = Stream.iterate(1)(_ + 1)

(s1 ++ s2).toList
(s1 ++ nats).take(10).toList
(nats ++ s1).take(35).toList

val timesThree = nats.take(10).map(_ * 3)
timesThree.toList

//Print out i it square and its cube
s1.flatMap(i => Stream("Start",i, i*i, i*i*i,"End")).toList