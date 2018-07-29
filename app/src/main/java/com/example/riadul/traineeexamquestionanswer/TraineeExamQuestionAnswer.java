package com.example.riadul.traineeexamquestionanswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TraineeExamQuestionAnswer extends AppCompatActivity {
    private String s1,data1[];
    private EditText inputText;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainee_exam_question_answer);
        ResultOut();
    }

    public void ResultOut()
    {

            StringDeclear();
            s1=s1.replaceAll("\n"," ");
            data1=s1.split(" ");
            inputText = (EditText) findViewById(R.id.inputText);
            answer = (TextView) findViewById(R.id.answer);

            inputText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    try {
                        String d = s.toString();


                        String data2[] = d.split(" ");
                        String temp = "";

                        int n = 0, m = 0;
                        for (int i = 1; i < data1.length; i++) {
                            //temp=data1[i-1];
                            for (int j = 0; j < data2.length; j++) {
                                if (data1[i + j].equalsIgnoreCase(data2[j]) == true) {
                                    // temp+=data1[i+j]+" ";
                                    m++;
                                } else {
                                    m = 0;
                                    break;
                                }
                            }

                            if (m == data2.length) {
                                m = n;
                                while (true) {
                                    if (data1[m].equalsIgnoreCase("answer:") == true) {
                                        temp += ("\n" + data1[m] + " " + data1[m + 1]);
                                        break;
                                    } else {
                                        if (data1[m].indexOf(".") != -1 && m != n) {
                                            temp += "\n";
                                        }
                                        temp += data1[m] + " ";
                                    }
                                    m++;
                                }
                                answer.setText(temp);
                                m = 0;
                                break;
                            }
                            n++;
                        }

                        String temp1[] = temp.split(" ");
                        if (temp1[0].indexOf(".") == -1) {
                            n = 0;
                            answer.setText("Answer Not Found!!!");
                        }
                    }
                    catch (Exception s1)
                    {
                        answer.setText("Answer Not Found!!!");
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

    }

    public  void StringDeclear()
    {
        s1="\n" +
                "\n" +
                "1. c is a\n" +
                "a. high level language\n" +
                "b. low level language \n" +
                "c. high level language with some low level features\n" +
                "d. low level language with some high level features\n" +
                "answer: c\n" +
                "2. c was primarily developed as a\n" +
                "a. systems programing language\n" +
                "b. general purpose language\n" +
                "c. data processing language\n" +
                "d. none of the above\n" +
                "answer: a\n" +
                "3. the differences between constructors and destructor are\n" +
                "a. constructors can take arguments but destructor can’t\n" +
                "b. constructors can be overloaded but destructors can’t be overloaded\n" +
                "c. both a & b\n" +
                "d. none of these\n" +
                "answer: c\n" +
                "4. a constructor is called whenever\n" +
                "a. a object is declared\n" +
                "b. an object is used\n" +
                "c. a class is declared\n" +
                "d. a class is used\n" +
                "answer: a\n" +
                "5. state the object oriented languages\n" +
                "a. c++\n" +
                "b. java\n" +
                "c. eiffel\n" +
                "d. all of the above\n" +
                "answer: d\n" +
                "\n" +
                "6. what is a reference?\n" +
                "a. an operator\n" +
                "b. a reference is an alias for an object\n" +
                "c. used to rename an object\n" +
                "d. none of these\n" +
                "answer: b\n" +
                "\n" +
                "7. the operator << is called\n" +
                "a. an insertion operator\n" +
                "b. put to operator\n" +
                "c. either a or b\n" +
                "d. none of these\n" +
                "answer: c\n" +
                "\n" +
                "8. the operator >> is called\n" +
                "a. an extraction operator\n" +
                "b. a get from operator\n" +
                "c. either a or b\n" +
                "d. get to operator\n" +
                "answer: c\n" +
                "9. in c programming which one of the following is string termination character? \n" +
                "a. ‘\\0’\n" +
                "b. ‘\\n’\n" +
                "c. ‘\\b’\n" +
                "d. ‘\\t’\n" +
                "answer: a\n" +
                "\n" +
                "10. a function which invokes itself repeatedly until some condition is satisfied is called ___________ \n" +
                "a. friend function\n" +
                "b. virtual function\n" +
                "c. recursive function\n" +
                "d. overloading function\n" +
                "answer: c\n" +
                "\n" +
                "11. in c/cpp programming a function can return \n" +
                "a. single value\n" +
                "b. double values\n" +
                "c. many values\n" +
                "d. none of these\n" +
                "answer: a\n" +
                "12. in c/cpp programming array index is always starts from\n" +
                "a. 0\n" +
                "b. 1\n" +
                "c. 2\n" +
                "d. 3\n" +
                "answer: a\n" +
                "13. which of the following is not the type of variable?\n" +
                "a. extrern\n" +
                "b. register\n" +
                "c. global\n" +
                "d. none of above\n" +
                "answer: d\n" +
                "\n" +
                "14. which of the following is the symbol for and operator?\n" +
                "a. ||\n" +
                "b. &\n" +
                "c. &&\n" +
                "d. $$\n" +
                "answer: c\n" +
                "15. which of the following is the correct statement?\n" +
                "a. variable name must start with underscore\n" +
                "b. variable name must have digit\n" +
                "c. variable name must have white space character\n" +
                "d. keyword can not be a variable name\n" +
                "answer: d\n" +
                "\n" +
                "\n" +
                "16. int z,x=5,y=-10,a=4,b=2;\n" +
                "z = x++ - --y * b / a;\n" +
                "what number will z in the sample code above contain?\n" +
                "A.\t5\n" +
                "B.\t6\n" +
                "C.\t10 \n" +
                "D.\t11\n" +
                "E.\t12\n" +
                "\n" +
                "answer: c\n" +
                "17. selection logic also called as\n" +
                "A.\tdecision logic\n" +
                "B.\titeration logic\n" +
                "C.\tsequence logic\n" +
                "D.\tlooping logic\n" +
                "answer: a\n" +
                "18. pseudo code is also known as\n" +
                "A.\tprogram design language\n" +
                "B.\thardware language\n" +
                "C.\tsoftware language\n" +
                "D.\talgorithm\n" +
                "answer: a\n" +
                "19. a flowchart that outlines with all detail is called as\n" +
                "A.\tmicro flowchart\n" +
                "B.\tmacro flowchart\n" +
                "C.\tflowchart\n" +
                "D.\talgorithm\n" +
                "answer: a\n" +
                "20. a flowchart that outlines the main segments of program is called as\n" +
                "A.\tmicro flowchart\n" +
                "B.\tmacro flowchart\n" +
                "C.\tflowchart\n" +
                "D.\talgorithm\n" +
                "answer: b\n" +
                "\n" +
                "21. which of the following is a pictorial representation of an algorithm?\n" +
                "A.\tpseudo code\n" +
                "B.\tprogram\n" +
                "C.\tflowchart\n" +
                "D.\talgorithm\n" +
                "answer: c\n" +
                "\n" +
                "22. an algorithm represented in the form of programming languages is _________\n" +
                "A.\tflowchart\n" +
                "B.\tpseudo code\n" +
                "C.\tprogram\n" +
                "D.\tnone\n" +
                "answer: c\n" +
                "23. flowcharts and algorithms are used for\n" +
                "A.\tbetter programming\n" +
                "B.\teasy testing and debugging\n" +
                "C.\tefficient coding\n" +
                "D.\tall\n" +
                "answer: d\n" +
                "\n" +
                "24. in structure charts modules are described as\n" +
                "A.\tcircle\n" +
                "B.\ttriangles\n" +
                "C.\trectangle\n" +
                "D.\tellipse\n" +
                "answer: b\n" +
                "\n" +
                "\n" +
                "25. execution of two or more programs by a single cpu is known as\n" +
                "A.\tmultiprogramming\n" +
                "B.\tmultiprocessing\n" +
                "C.\ttimesharing\n" +
                "answer: b\n" +
                "26. which of the following structures are used in computer programs?\n" +
                "A.\tsequential\n" +
                "B.\tdecision\n" +
                "C.\ttimesharing\n" +
                "D.\tnone\n" +
                "answer: d\n" +
                "27. which of the following is a program planning tool?\n" +
                "A.\tsequential\n" +
                "B.\tdecision\n" +
                "C.\tpseudo code\n" +
                "D.\tboth b and c\n" +
                "answer: d\n" +
                "28. the chart that contains only function flow and no code is called as\n" +
                "A.\tflowchart\n" +
                "B.\tstructure chart\n" +
                "C.\tboth a and b\n" +
                "D.\tnone\n" +
                "answer: b\n" +
                "29. c language developed at _____?\n" +
                "A.\tat & t's bell laboratories of usa in 1972\n" +
                "B.\tat & t's bell laboratories of usa in 1970\n" +
                "C.\tsun microsystems in 1973\n" +
                "D.\tcambridge university in 1972\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "30. for 16-bit compiler allowable range for integer constants is ______ ?\n" +
                "A.\t-3.4e38 to 3.4e38\n" +
                "B.\t-32767 to 32768\n" +
                "C.\t-32768 to 32767\n" +
                "D.\t-32668 to 32667\n" +
                "answer: c\n" +
                "31. what is an array?\n" +
                "A.\tan array is a collection of variables that are of the dissimilar data type.\n" +
                "B.\tan array is a collection of variables that are of the same data type.\n" +
                "C.\tan array is not a collection of variables that are of the same data type.\n" +
                "D.\tnone of the above.\n" +
                "\n" +
                "answer: b\n" +
                "32. what is right way to initialization array?\n" +
                "A.\tint num[6] = { 2, 4, 12, 5, 45, 5 } ;\n" +
                "B.\tint n{} = { 2, 4, 12, 5, 45, 5 } ;\n" +
                "C.\tint n{6} = { 2, 4, 12 } ;\n" +
                "D.\tint n(6) = { 2, 4, 12, 5, 45, 5 } ;\n" +
                "\n" +
                "answer: a\n" +
                "33. an array elements are always stored in _________ memory locations.\n" +
                "A.\tsequential\n" +
                "B.\trandom\n" +
                "C.\tsequential and random\n" +
                "D.\tnone of the above\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "34. bitwise operators can operate upon?\n" +
                "A.\tdouble and chars\n" +
                "B.\tfloats and doubles\n" +
                "C.\tints and floats\n" +
                "D.\tints and chars\n" +
                "\n" +
                "answer: d\n" +
                "35. what is constant?\n" +
                "A.\tconstants have fixed values that do not change during the execution of a program\n" +
                "B.\tconstants have fixed values that change during the execution of a program\n" +
                "C.\tconstants have unknown values that may be change during the execution of a program\n" +
                "D.\tnone of the above\n" +
                "\n" +
                "answer: a\n" +
                "\n" +
                "36. in switch statement, each case instance value must be _______?\n" +
                "A.\tconstant\n" +
                "B.\tvariable\n" +
                "C.\tspecial symbol\n" +
                "D.\tnone of the avobe\n" +
                "\n" +
                "answer: a\n" +
                "37. the statement print f (\"%d\", 10 ? 0 ? 5 : 1 : 12); will print?\n" +
                "A.\t10\n" +
                "B.\t0\n" +
                "C.\t12\n" +
                "D.\t1\n" +
                "\n" +
                "answer: d\n" +
                "\n" +
                "38. which of the following data structure is linear type?\n" +
                "A.\tstrings\n" +
                "B.\tqueue\n" +
                "C.\tlists\n" +
                "D.\tall of the above\n" +
                "\n" +
                "answer: d\n" +
                "39. number of binary trees formed with 5 nodes are\n" +
                "A.\t30\n" +
                "B.\t36\n" +
                "C.\t108\n" +
                "D.\t42\n" +
                "\n" +
                "answer: d\n" +
                "40. the \"c\" language is\n" +
                "A.\tcontext free language\n" +
                "B.\tcontext sensitive language\n" +
                "C.\tregular language\n" +
                "D.\tnone of the above\n" +
                "\n" +
                "answer: a\n" +
                "41. c is ______ language?\n" +
                "A.\tlow level\n" +
                "B.\thigh level\n" +
                "C.\tassembly level\n" +
                "D.\tmachine level\n" +
                "\n" +
                "answer:  b\n" +
                "\n" +
                "\n" +
                "\n" +
                "42. the default parameter passing mechanism is called as\n" +
                "A.\tcall by value\n" +
                "B.\tcall by reference\n" +
                "C.\tcall by address\n" +
                "D.\tcall by name\n" +
                "\n" +
                "answer: a\n" +
                "43. the keywords are also called\n" +
                "A.\tsafe words\n" +
                "B.\tstatic words\n" +
                "C.\treserved words\n" +
                "D.\treused words\n" +
                "\n" +
                "answer: c\n" +
                "44. what will be the output of 5.0 / 2?\n" +
                "A.\t2\n" +
                "B.\t3\n" +
                "C.\t0\n" +
                "D.\t2.5\n" +
                "\n" +
                "answer: d\n" +
                "45. representation of data structure in memory is known as\n" +
                "A.\trecursive\n" +
                "B.\tabstract data type\n" +
                "C.\tstorage structure\n" +
                "D.\tfile structure\n" +
                "\n" +
                "answer: b\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "46. type of data and its value is described dy\n" +
                "A.\tconstants\n" +
                "B.\tvariables\n" +
                "C.\tdata type\n" +
                "D.\tnone of the above\n" +
                "\n" +
                "answer: b\n" +
                "47. how many times is a do while loop guaranteed to loop?\n" +
                "A.\t0\n" +
                "B.\tvariable\n" +
                "C.\t1\n" +
                "D.\tinfinitely\n" +
                "\n" +
                "answer: c\n" +
                "48. which of the following is not an iterative statement?\n" +
                "A.\twhile\n" +
                "B.\tdo while\n" +
                "C.\tswitch\n" +
                "D.\tfor\n" +
                "answer: c\n" +
                "49. which is an invalid name of identifier?\n" +
                "A.\tworld\n" +
                "B.\taddition23\n" +
                "C.\ttest-name\n" +
                "D.\tfactorial\n" +
                "answer: c\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "50. what will be the output of the program ? #include void main() \n" +
                "{ float arr[] = {12.4, 2.3, 4.5, 6.7}; \n" +
                "printf(\"%d\", sizeof(arr)/sizeof(arr[0])); \n" +
                "} \n" +
                "A.\t5 \n" +
                "B.\t4 \n" +
                "C.\t6 \n" +
                "D.\t7 \n" +
                "e. none of these \n" +
                "\n" +
                "answer: b\n" +
                "51. what is right way to initialize array\n" +
                "A.\tint num[6] = { 2, 4, 12, 5, 45, 5 };\n" +
                "B.\tb. int n{} = { 2, 4, 12, 5, 45, 5 }; \n" +
                "C.\tc. int n{6} = { 2, 4, 12 }; \n" +
                "D.\td. int n(6) = { 2, 4, 12, 5, 45, 5 }; \n" +
                "answer: a\n" +
                "52. which of the following part of the android is open sourced? \n" +
                "\n" +
                "A.\tlow-level linux modules \n" +
                "B.\tall of these answers \n" +
                "C.\tnative libraries \n" +
                "D.\tapplication frame work \n" +
                "E.\tcomplete applications \n" +
                "answer: b\n" +
                "\n" +
                "53. how to pass the data between activities in android? \n" +
                "A.\tintent \n" +
                "B.\tcontent provider \n" +
                "C.\tbroadcast receiver \n" +
                "D.\tnone of the above \n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "54. which database is shipped with android by default? \n" +
                "\n" +
                "A.\tsqlite \n" +
                "B.\tapache \n" +
                "C.\tmysql \n" +
                "D.\toracle \n" +
                "answer: a\n" +
                "\n" +
                "55. which file contains all the text of an application? \n" +
                "\n" +
                "A.\tstack.xml \n" +
                "B.\ttext.xml \n" +
                "C.\tstrings.xml \n" +
                "D.\tstring.java \n" +
                "answer: c\n" +
                "\n" +
                "\n" +
                "56. which  of these is incorrect string literal?\n" +
                "\n" +
                "A.\t“hello world”\n" +
                "B.\t“hello\\nworld”\n" +
                "C.\t“\\”hello world”\"\n" +
                "D.\t“hello\n" +
                "E.\tworld”\n" +
                "answer: d\n" +
                "\n" +
                "57. …….. data type can store unstructured data\n" +
                "A.\traw\n" +
                "B.\tchar\n" +
                "C.\tnumeric\n" +
                "D.\tvarchar\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "58. which are the two ways in which entities can participate in a relationship?\n" +
                "A.\tpassive and active\n" +
                "B.\ttotal and partial\n" +
                "C.\tsimple and complex\n" +
                "D.\tall of the above\n" +
                "answer: b\n" +
                "\n" +
                "\n" +
                "59. which database level is closest to the users?\n" +
                "A.\texternal\n" +
                "B.\tinternal\n" +
                "C.\tphysical\n" +
                "D.\tconceptual\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "60. the database schema is written in\n" +
                "A.\thll\n" +
                "B.\tdml\n" +
                "C.\tddl\n" +
                "D.\tdcl\n" +
                "answer: c\n" +
                "\n" +
                "\n" +
                "61. dcl stands for\n" +
                "\n" +
                "A.\tdata control language\n" +
                "B.\tdata console language\n" +
                "C.\tdata console level\n" +
                "D.\tdata control level\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "62. …………………… is the process of organizing data into related tables.\n" +
                "A.\tnormalization\n" +
                "B.\tgeneralization\n" +
                "C.\tspecialization\n" +
                "D.\tnone of the above\n" +
                "answer: a\n" +
                "\n" +
                "63. grant and revoke are ……. statements.\n" +
                "A.\tddl\n" +
                "B.\ttcl\n" +
                "C.\tdcl\n" +
                "D.\tdml\n" +
                "answer: c\n" +
                "\n" +
                "\n" +
                "64. a ……… is used to define overall design of the database\n" +
                "A.\tschema\n" +
                "B.\tapplication program\n" +
                "C.\tdata definition language\n" +
                "D.\tcode\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "65. data independence means\n" +
                "A.\tdata is defined separately and not included in programs.\n" +
                "B.\tprograms are not dependent on the physical attributes of data\n" +
                "C.\tprograms are not dependent on the logical attributes of data\n" +
                "D.\tboth b and c\n" +
                "answer: d\n" +
                "\n" +
                "\n" +
                "66. ………………… is a full form of sql.\n" +
                "A.\tstandard query language\n" +
                "B.\tsequential query language\n" +
                "C.\tstructured query language\n" +
                "D.\tserver side query language\n" +
                "answer: c\n" +
                "\n" +
                "67. dfd stands for\n" +
                "A.\tdata flow document\n" +
                "B.\tdata file diagram\n" +
                "C.\tdata flow diagram\n" +
                "D.\tnon of the above\n" +
                "answer: c\n" +
                "\n" +
                "68. php runs on different platforms (windows, linux, unix, etc.)\n" +
                "\n" +
                "A.\ttrue\n" +
                "B.\tfalse\n" +
                "answer: a\n" +
                "\n" +
                "\n" +
                "69. variables always start with a ........ in php\n" +
                "A.\tpond-sign\n" +
                "B.\tyen-sign\n" +
                "C.\tdollar-sign\n" +
                "D.\teuro-sign\n" +
                "answer: c\n" +
                "\n" +
                "70. what is the html tag for break?\n" +
                "A.\t<br>\n" +
                "B.\t<dr>\n" +
                "C.\t<th>\n" +
                "D.\t<td>\n" +
                "answer: a\n" +
                "\n" +
                "71. which is logical operators\n" +
                "A.\t==,!=\n" +
                "B.\t+,-\n" +
                "C.\t&&,||\n" +
                "D.\tall of the above\n" +
                "answer: c\n" +
                "\n" +
                "72. what will be the result of the expression 13 & 25?\n" +
                "A.\t38\n" +
                "B.\t25\n" +
                "C.\t9\n" +
                "D.\t12\n" +
                "answer: c\n" +
                "\n" +
                "73. actions associated with objects are called _______________.\n" +
                "A.\tforms\n" +
                "B.\tevents\n" +
                "C.\tproperties\n" +
                "D.\tmethods\n" +
                "answer: d\n" +
                "74.  which of the following is not an example of an object?\n" +
                "A.\tform\n" +
                "B.\tcolor\n" +
                "C.\tbutton\n" +
                "D.\ttext box\n" +
                "answer: b\n" +
                "\n" +
                "\t75. which of the following is not an example of a procedural programming language?\n" +
                "A.\tcobol\n" +
                "B.\tfortran\n" +
                "C.\tpascal\n" +
                "D.\tvisual basic\n" +
                "answer: d\n" +
                "\t \n" +
                "76.  a new window added to a c# application is called a _______________.\n" +
                "\t\n" +
                "\n" +
                "A.\tform\n" +
                "B.\tproperty\n" +
                "C.\tmethod\n" +
                "D.\tcontrol\n" +
                "answer: a\n" +
                "77. the windows _______________ defines how the various elements will look and function.\n" +
                "A.\tfront end\n" +
                "B.\tcolor\n" +
                "C.\tfont\n" +
                "D.\tgraphical user interface (gui)\n" +
                "answer: d\n" +
                "\n" +
                "78. dennis was author of famous programming book\n" +
                "A.\tc programming and techniques\n" +
                "B.\tthinking in c\n" +
                "C.\tthe c programming language\n" +
                "D.\tlearn c step by step\n" +
                "answer: c\n" +
                "\n" +
                "79. is used to construct the __________ .\n" +
                "A.\tnone of these\n" +
                "B.\tboolean object\n" +
                "C.\tfloating object\n" +
                "D.\tinteger object\n" +
                "answer: b\n" +
                "\n" +
                "80.  which of the following data type is not considered as data type in java programming.\n" +
                "A.\tchar\n" +
                "B.\tboolean\n" +
                "C.\tstring\n" +
                "D.\tint\n" +
                "\n" +
                "answer: c\n" +
                "81. default value of string (or any object) in java programming is _____________.\n" +
                "A.\t0\n" +
                "B.\tfalse\n" +
                "C.\t'\\u0000'\n" +
                "D.\tnull\n" +
                "answer: c\n" +
                "\n" +
                "82. default value of character data type in java programming is ___________________.\n" +
                "A.\t'\\u0000'\n" +
                "B.\tundefine\n" +
                "C.\tnull\n" +
                "D.\t0\n" +
                "answer: a\n" +
                "\n" +
                "83. default value of \"double\" data type is ___________.\n" +
                "A.\t0\n" +
                "B.\t0.0\n" +
                "C.\tnull\n" +
                "D.\t0.0d\n" +
                "answer: d\n" +
                "\n" +
                "84. default value of variable having boolean data type is ___________.\n" +
                "A.\t1\n" +
                "B.\ttrue\n" +
                "C.\t0\n" +
                "D.\tfalse\n" +
                "answer: d\n" +
                "\n" +
                "85. which of the following data type(s) can store 64 bit value.\n" +
                "A.\tint\n" +
                "B.\tlong\n" +
                "C.\tfloat\n" +
                "D.\tdouble\n" +
                "answer: b\n" +
                "\n" +
                "86. which of the following is data type stores longest ______________ floating point number.\n" +
                "\n" +
                "A.\tdouble\n" +
                "B.\tlong\n" +
                "C.\tboolean\n" +
                "D.\tfloat\n" +
                "answer: a\n" +
                "87. primitive data type 'byte' is having size _______ byte(s) in java programming.\n" +
                "A.\t2\n" +
                "B.\t3\n" +
                "C.\t4\n" +
                "D.\t1\n" +
                "answer: d\n" +
                "88. what is size of integer in java programming.\n" +
                "A.\t3 bytes\n" +
                "B.\t4 bytes\n" +
                "C.\t2 bytes\n" +
                "D.\t8 bytes\n" +
                "\n" +
                "answer: b\n" +
                "89. in order to fetch stream of data from network or file , following data type is used ___________.\n" +
                "A.\tbyte\n" +
                "B.\tint\n" +
                "C.\tdouble\n" +
                "D.\tchar\n" +
                "answer: a\n" +
                "90. range of byte data type is ____________.\n" +
                "A.\t-128 to 256\n" +
                "B.\t-127 to 128\n" +
                "C.\t-128 to 255\n" +
                "D.\t-128 to 127\n" +
                "\n" +
                "answer: d\n" +
                "\n" +
                "91. character data type cannot store following value.\n" +
                "A.\tspecial character\n" +
                "B.\tletter\n" +
                "C.\tdigit\n" +
                "D.\tstring\n" +
                "answer: d\n" +
                "\n" +
                "92. which of the following data types comes under floating data types ?\n" +
                "A.\tbyte\n" +
                "B.\tdouble\n" +
                "C.\tlong\n" +
                "D.\tint\n" +
                "answer: b\n" +
                "\n" +
                "93. which of the following is not a primitive data type ?\n" +
                "A.\tint\n" +
                "B.\tshort\n" +
                "C.\tbyte\n" +
                "D.\tenum\n" +
                "answer: d\n" +
                "\n" +
                "94. which of the following is smallest integer data type ?\n" +
                "A.\tlong\n" +
                "B.\tint\n" +
                "C.\tshort\n" +
                "D.\tbyte\n" +
                "answer: d\n" +
                "95. which of the following tool used to execute java code.\n" +
                "A.\tjava\n" +
                "B.\trmic\n" +
                "C.\tjavadoc\n" +
                "D.\tjavac\n" +
                "answer: a\n" +
                "96. which of the tool is used to compile java code ?\n" +
                "A.\tjar\n" +
                "B.\tjavac\n" +
                "C.\tjavadoc\n" +
                "D.\tjava\n" +
                "answer: b\n" +
                "97. java source code is compiled into ______________ .\n" +
                "A.\tsource code\n" +
                "B.\t.obj\n" +
                "C.\t.exe\n" +
                "D.\tbytecode\n" +
                "answer: d\n" +
                "\n" +
                "98. html is derived from _______.\n" +
                "A.\turl\n" +
                "B.\tsgml\n" +
                "C.\ttcp/ip\n" +
                "D.\tbrowsers\n" +
                "answer: b\n" +
                "\n" +
                "99. url means ________.\n" +
                "A.\taddress of the resource on the web\n" +
                "B.\tterm used to describe website\n" +
                "C.\tterm used to get online program\n" +
                "D.\tnone of these\n" +
                "answer: a\n" +
                "100. to design web pages we need to use _________.\n" +
                "A.\tserver\n" +
                "B.\txml\n" +
                "C.\tbrowser\n" +
                "D.\thtml\n" +
                "answer: d\n" +
                "101. which of the following language is used to write animation and games in browser ?\n" +
                "A.\tjava\n" +
                "B.\tnone of these\n" +
                "C.\tc programming\n" +
                "D.\thtml\n" +
                "answer: a\n" +
                "102. software which allows user to view the webpage is called as __________.\n" +
                "A.\toperating system\n" +
                "B.\tinternet browser\n" +
                "C.\tinterpreter\n" +
                "D.\twebsite\n" +
                "answer: b\n" +
                "\n" +
                "103. computer that requests the resources or data from other computer is called as ________ computer.\n" +
                "A.\tclient\n" +
                "B.\tserver\n" +
                "answer: a\n" +
                "104.  ________ programs are automatically loaded and operates as a part of browser.\n" +
                "\n" +
                "A.\tutilities\n" +
                "B.\tplug-ins\n" +
                "C.\twidgets\n" +
                "D.\tadd-ons\n" +
                "answer: b\n" +
                "105. interface to system call is through\n" +
                "A.\tusing user defined functions\n" +
                "B.\tfunctions\n" +
                "C.\tapi\n" +
                "D.\tnone of these\n" +
                "\n" +
                "answer: c\n" +
                "\n" +
                "106. which is open source software?\n" +
                "A.\tmysql\n" +
                "B.\tphp\n" +
                "C.\tlinux os\n" +
                "D.\tall of the above\n" +
                "answer: d\n" +
                "\n" +
                "107. multiprocessor system consist of?\n" +
                "A.\tmultiple processor\n" +
                "B.\tmultiple memories\n" +
                "C.\tmultiple i/o devices\n" +
                "D.\tnone of the above\n" +
                "answer: a\n" +
                "\n" +
                "108. multiprocessor system result in?\n" +
                "A.\tincreased throughput\n" +
                "B.\tcost effective\n" +
                "C.\treliability\n" +
                "D.\tall of the above\n" +
                "answer: d\n" +
                "\n" +
                "\n" +
                "109. operating system is?\n" +
                "A.\twhich runs during log off\n" +
                "B.\tprogram which runs for short duration\n" +
                "C.\twhich runs at the start of computer system\n" +
                "D.\tlong running program in computer\n" +
                "answer: d\n" +
                "\n" +
                "\n" +
                "110. in the following code segment:\n" +
                "int z,x=5,y=-10,a=4,b=2;\n" +
                "\tz=x++ - --y* b/a;\n" +
                "what will be the final value of z?\n" +
                "A.\t5\n" +
                "B.\t6\n" +
                "C.\t10\n" +
                "D.\t11\n" +
                "answer: c\n" +
                "\n";
    }
}

