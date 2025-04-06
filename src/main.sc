require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        q!: $regex</hello>
        q: $regex<.*привет.*$>
        q: $regex<.*здравствуй.*$>
        intent!: /hello
        a: hello

    state: weather
        q!: $regex</weather>
        q: $regex<.*дожд.*$>
        q: $regex<.*погод.*$>
        intent!: /weather
        a: weather

    state: currency
        q!: $regex</currency>
        intent!: /currency
        a: currency
        intent: /currency || toState = "./"

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}