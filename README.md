# Pinyin
中文转换拼音的工具类，全部大写，全部小写，首字母大小写等等。。。

使用方法如下 : 

获取全拼,全部大写
使用方法 ： 
String string = PinYin.getFirstLetterAllBig("中华人民共和国");
输出 ： 
ZHONGHUARENMINGONGHEGUO

获取全拼,全部小写
使用方法 ： 
String string = PinYin.getFirstLetterAllSmall("中华人民共和国");
输出 ： 
zhonghuarenmingongheguo

获取全拼,首字母大写
使用方法 ： 
String string = PinYin.getFirstLetterAllBigSmall("中华人民共和国");
输出 ： 
ZhongHuaRenMinGongHeGuo

只获取中文首字母(不是全拼),例如:中文=ZW,大写
使用方法 ： 
String string = PinYin.getFirstLetterBig("中华人民共和国");
输出 ： 
ZHRMGHG

只获取中文首字母(不是全拼),例如:中文=zw,小写
使用方法 ： 
String string = PinYin.getFirstLetterSmall("中华人民共和国");
输出 ： 
zhrmghg

如果有多个中文之间有符号之类的会自动识别
例如 ： 
String string = PinYin.getFirstLetterAllBig("中华人民共和国,中国共产党");
输出 ： 
ZHONGHUARENMINGONGHEGUO,ZHONGGUOGONGCHANDANG




