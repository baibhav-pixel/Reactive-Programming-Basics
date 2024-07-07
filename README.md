Hi Everyone, hope you are doing well. We are here to look into how basics of Reactive Programming looks like!

I recently came across #ReactiveProgramming in Java. Reactive Programming is a declarative programming paradigm concerned with data stream and propagation of data.

As backend developer, we generally think that a request hits controller one at a time and we never bother on the controller logic that we put in. There could be some lines of code in controller logic that are being unnecessarily sequential and could block the thread which would slow down the system. So, the cost we pay is performance!
This becomes more prominent when an application has:

- High data scale

- High usage scale

- Cloud based costs



This is where Reactive Programming dives in, leaving other approaches like Concurrency APIs behind as it is more simpler.
Reactive Programming intention is to minimize the number of blocks in code, rather it just wants the "caller/source" to wait. A good analogy is - Its the user that should wait for the order to be served to him, rather than the chef waiting for the ingredients if customers would have placed order.
