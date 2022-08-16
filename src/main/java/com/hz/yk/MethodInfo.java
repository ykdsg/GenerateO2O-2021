package com.hz.yk;

import com.intellij.psi.PsiField;
import com.intellij.psi.PsiParameter;

import java.util.List;

public class MethodInfo {

    private final String methodName;
    private final String returnClassName;
    private final PsiParameter psiParameter;
    private final List<PsiField> paramentFields;

    /**
     * @param methodName      方法名称
     * @param returnClassName 返回的值的class名称
     * @param psiParameter    方法参数第一个值
     * @param paramentFields  方法参数的class里field 列表
     */
    public MethodInfo(String methodName, String returnClassName, PsiParameter psiParameter,
                      List<PsiField> paramentFields) {
        this.methodName = methodName;
        this.returnClassName = returnClassName;
        this.psiParameter = psiParameter;
        this.paramentFields = paramentFields;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getReturnClassName() {
        return returnClassName;
    }

    public PsiParameter getPsiParameter() {
        return psiParameter;
    }

    public List<PsiField> getParamentFields() {
        return paramentFields;
    }
}
