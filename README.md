# TAdemo
1. 安装好maven（或者使用idea内置maven）后，导入项目。
2. 启动TAdemoApplication这个类
3. 输入localhost:8989/index访问首页；输入localhost:8989/table访问基本表格

## TAdemo调用层级
以查询所有学生这个功能为例
1. 输入localhost:8989/table后进入PageController类的table方法
2. （controller层） 在table方法里，调用studentService.getAllStudents()去获取所有学生
3. （service层） 在getAllStudents方法里，调用studentMapper.findAll()去从数据库获取所有学生，如果数据库记录为0，加一条默认数据（service层主要做一些逻辑判断与验证）
4. （mapper层）  通过注解的形式从数据库中获取数据
5. （controller层）  将数据放入model，并跳到table.html


