require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        q!: $regex</hello>
        q: $regex<.*здравствуй.*$>
        q: $regex<.*привет.*$>
        intent!: /Hello
        a: hello
        

    state: NoMatch
        event!: noMatch
        intent!: /NoMacth
        a: Я не понял. Вы сказали: {{$request.query}}