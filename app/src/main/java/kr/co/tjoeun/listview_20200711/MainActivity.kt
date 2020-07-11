package kr.co.tjoeun.listview_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listview_20200711.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("조경진", "서울시 은평구", 1988))
        mStudentList.add(Student("김문기", "경기도 남양주시", 1994))
        mStudentList.add(Student("오윤도", "경기도 남양주시", 1997))
        mStudentList.add(Student("이진슬", "서울시 강서구", 1994))
        mStudentList.add(Student("최지형", "서울시 강동구", 1992))
        mStudentList.add(Student("최현일", "경기도 남양주시", 1990))
        mStudentList.add(Student("황선혜", "서울시 금천구", 1996))



    }
}