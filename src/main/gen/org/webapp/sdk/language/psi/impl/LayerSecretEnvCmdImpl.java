// This is a generated file. Not intended for manual editing.
package org.webapp.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.webapp.sdk.language.psi.LayerTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.webapp.sdk.language.psi.*;

public class LayerSecretEnvCmdImpl extends ASTWrapperPsiElement implements LayerSecretEnvCmd {

  public LayerSecretEnvCmdImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LayerVisitor visitor) {
    visitor.visitSecretEnvCmd(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LayerVisitor) accept((LayerVisitor)visitor);
    else super.accept(visitor);
  }

}