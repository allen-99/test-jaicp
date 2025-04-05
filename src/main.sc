require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        q!: $regex</hello>
        intent!: /hello
        a: hello

    state: weather
        q!: $regex</weather>
        intent!: /weather
        a: weather
        intent: /weather || toState = "./"

    state: currency
        q!: $regex</currency>
        intent!: /currency
        a: currency
        intent: /currency || toState = "./"

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}