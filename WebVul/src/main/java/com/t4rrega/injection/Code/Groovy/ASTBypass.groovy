// 测试时发现不加 assert 也能够执行

this.class.classLoader.parseClass('''
    @groovy.transform.ASTTest(value={
        assert Runtime.getRuntime().exec("open -a Calculator.app")
    })
    def x
''');
