require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: hello
        q!: $regex</hello>
        q: $regex<.*здравствуй.*$>
        q: $regex<.*привет.*$>
        intent!: /hello
        a: hello
        

    state: NoMatch
        event!: noMatch
        intent!: /NoMacth
        a: Я не понял. Вы сказали: {{$request.query}}