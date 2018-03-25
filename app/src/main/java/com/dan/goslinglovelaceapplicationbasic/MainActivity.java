package com.dan.goslinglovelaceapplicationbasic;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String ada= new String( "阿达·洛夫莱斯(Ada Lovelace，1815年12月10日-1852年11月27日)，又译阿达·奥古斯塔，数学家，穿孔机程序创始人，19世纪诗人拜伦的女儿。她建立了循环和子程序概念，为计算程序拟定算法，被视为世界上第一位软件设计师，她对计算机的预见超前了整整一个世纪。美国国防部曾将一种计算机语言命名为阿达语言，以纪念这位世界上第一位软件工程师。她死后一百年，于1953年，埃达之前对查尔斯·巴贝奇的《分析机概论》所留下的笔记被重新公布，并被认为对现代计算机与软件工程造成了重大影响。 埃达是她诗人父亲—拜伦与母亲安妮·伊莎贝拉·米尔班奇唯一的合法子嗣。她的名字取自拜伦的异母的姊妹奥古斯塔·李。拜伦与安妮的婚事是在奥古斯塔为了避免丑闻，而怂恿拜伦与安妮结合的产物。然而，在1816年1月16日，安妮还是离开拜伦，带着一个月大的埃达离开。同年4月21日，拜伦签下了分居协议，并离开英国。 埃达从未见过她同父异母的妹妹阿拉格·拜伦，阿拉格是拜伦与克莱尔·克莱蒙所出，但于1822年死去，享年5岁。至于埃达的另一位亲戚奥古斯塔·李之女伊丽莎白·梅朵拉·李则有与她照过面，并由埃达的母亲告知埃达与梅朵拉彼此的身世。 " );
    String james=new String("在詹姆斯·高斯林12岁的时候，詹姆斯·高斯林已能设计电子游戏机，帮忙邻居修理收割机。大学时期在天文系担任程式开发工读生，1977年获得了加拿大卡尔加里大学计算机科学学士学位。1983年获得了美国卡内基梅隆大学计算机科学博士学位，毕业后到IBM工作，设计IBM第一代工作站NeWS系统，但不受重视。后来转至Sun公司。\n" +
            "\n" +
            "1990年，与PatrickNaughton和MikeSheridan等人合作绿色计划，后来发展一套语言叫做Oak，后改名为Java。1994年底，JamesGosling在硅谷召开的技术、教育和设计大会上展示Java程式。2000年，Java成为世界上最流行的电脑语言。\n" +
            "\n" +
            "2009年四月，Sun被甲骨文公司并购。詹姆斯于2010年四月时宣布从甲骨文公司离职。\n" +
            "\n" +
            "2011年3月29日，高斯林在个人博客上宣布将加入Google。\n" +
            "\n" +
            "2011年8月30日，仅仅加入Google数月之后的高斯林就在个人博客上宣布离开Google，加盟一家从事海洋机器人研究的创业公司LiquidRobotics，担任首席软件架构师。\n" +
            "\n" +
            "在2011年5月建立的Scala公司Typesafe Inc.， 高斯林被聘请为公司顾问。\n" +
            "\n" +
            "2017年5月22日，加盟亚马逊云计算部门。在加盟亚马逊云计算部门之前，他在Liquid Robotics公司负责水下机器人的软件设计工作[1]。 ");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isZh();
    }

    private boolean isZh() {
        Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
        int ori = mConfiguration.orientation; //获取屏幕方向
        Locale locale = getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        if (language.endsWith("zh"))    //系统为中文
        {
            if (ori == mConfiguration.ORIENTATION_LANDSCAPE)     //横屏
            {  TextView jameschinese=(TextView)findViewById(R.id.textViewjam2);
                jameschinese.setText(james);}

            else if (ori == mConfiguration.ORIENTATION_PORTRAIT)
                //竖屏
            { TextView adachinese=(TextView)findViewById(R.id.textViewada2);
                adachinese.setText(ada);}
            return true;
        }
        else if (language.endsWith("en"))   {}                   //系统为英文

        return true;
    }

}
