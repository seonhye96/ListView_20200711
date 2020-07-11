package kr.co.tjoeun.listview_20200711.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.listview_20200711.R
import kr.co.tjoeun.listview_20200711.datas.Student

class StudentAdapter(val mContext:Context, val resId:Int, val mList:List<Student>) :ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

//        여기가 실행되는 시점 => tempRow는 null일 가능성이 없다.
        val row  = tempRow!! // 널이 아니야!! 하고 대입


        return row
    }

}