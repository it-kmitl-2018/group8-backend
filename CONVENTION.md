ชื่อกลุ่ม : 8

ภาษา, Framework, Library ที่จะใช้ : Kotlin

kotlinVersion = '1.2.20'
springBootVersion = '1.5.10.RELEASE'

ชื่อตัวแปร : testOnClick (Lower Camel Case)
ชื่อคลาส : HelloWorld (Upper Camel Case)

* การเว้นบรรทัด : 
	* Import จะเว้นทีละบรรทัด ไม่มีบรรทัดว่าง
	* Package ห่างจาก Import 1 บรรทัด
	* Class ห่างจาก Import 1 บรรทัด
	* Class Variable ห่างจาก Class 0 บรรทัด
	* Function/Method ห่างจาก Class/Class Variable 1 บรรทัด
	* Method Variable ห่างจาก Function/Method 0 บรรทัด
	* Different Type of Variable ห่างกัน 0 บรรทัด
	* Input/Output ห่างจาก Variable 1 บรรทัด
	* To Do/Input/Output ห่างกัน 0 บรรทัด
	* If ห่างจาก Variable/Input/Output/To Do 1 บรรทัด
	* To Do ห่างจาก If 0 บรรทัด
	* For ห่างจาก To Do/Variable/I/O 1 บรรทัด
	* To Do ห่างจาก For 0 บรรทัด
	* Return ห่างจากส่วนอื่น ๆ 0 บรรทัด
	* ทุกครั้งที่จบไฟล์เว้น 1 บรรทัด

* การกำหนด White space : 
	* ห้ามมี White space เปล่าด้านหลังแต่ละบรรทัด
	* มี White space ทุกครั้งหลังตามด้วย Comma หรือ Semi-Colon(กรณี For) เช่น fucntion(a, b, c), for(a = 5; a < 0; a --)
	* มี White space ระหว่าง operator ขณะกำหนดค่าตัวแปร เช่น int x = 9; a + b = 100;
	* ไม่มี White space ก่อนจบการใช้งานด้วย Semi Colon เช่น writeThis; areYou;
  * ใน Vue.js การแสดงผลของค่าใน HTML ให้ใช้ปีกกาสองปีกกาและมี white space ห่างจากชื่อตัวแปรด้านละหนึึ่ง เช่น {{ message }}
  * ใน HTML มีการเว้นหนึ่ง white space สำหรับการกำหนดค่าที่แตกต่างกัน เช่น <input name="hello" v-model="vue"/> หรือ <div class="hello"> เป็นต้น
  * ใน JS มีการเว้นวรรคหนึ่งครั้งก่อนกำหนดค่า เช่น message: 'Hello World'
  
* การกำหนด Indent : เคาะ 4 Space

* การกำหนดปีกกาของ if / function / class : มี White space ก่อนขึ้นปีกกา เช่น 

class A {

}

data () {

}

* การ Comment :
มี Comment กำกับ Method 1 บรรทัด เมื่อมีความจำเป็น
