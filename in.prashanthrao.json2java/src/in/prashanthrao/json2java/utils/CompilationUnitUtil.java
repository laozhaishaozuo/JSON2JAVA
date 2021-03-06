package in.prashanthrao.json2java.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class CompilationUnitUtil {

	public static void createCompilationUnit(IPackageFragment fragment, IFile file) throws JavaModelException {

		ICompilationUnit compilationUnit = fragment.createCompilationUnit("Root.java", "package " + fragment.getElementName() + ";",
				false, null);

		IType classType = compilationUnit.createType("public class Root{}", null, true, new NullProgressMonitor());
		IJavaElement field= classType.createField("int i;", null, false, new NullProgressMonitor());
		IJavaElement method= classType.createMethod("void f(){}", null, false, new NullProgressMonitor());
	}
}
