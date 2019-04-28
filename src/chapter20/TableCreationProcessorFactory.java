/*package chapter20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import com.sun.mirror.declaration.ClassDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.util.SimpleDeclarationVisitor;

public class TableCreationProcessorFactory 
	implements AnnotationProcessorFactory{

	@Override
	public Collection<String> supportedOptions() {
		// TODO Auto-generated method stub
		return Collections.emptySet();
	}

	@Override
	public Collection<String> supportedAnnotationTypes() {
		// TODO Auto-generated method stub
		return Arrays.asList(
				"annotations.database.DBTable",
				"annotations.database.Constraints",
				"annotations.database.SQLString",
				"annotations.database.SQLInteger");
	}

	@Override
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
			AnnotationProcessorEnvironment env) {
		// TODO Auto-generated method stub
		return new TableCreationProcessor(env);
	}
	private static class TableCreationProcessor
		implements AnnotationProcessor{
		private final AnnotationProcessorEnvironment env;
		private String sql = "";
		public TableCreationProcessor(AnnotationProcessorEnvironment env) {
			this.env = env;
		}
		@Override
		public void process() {
			for(TypeDeclaration typeDecl :
				env.getSpecifiedTypeDeclarations()) {
				typeDecl.accept(getDeclarationScanner(
						new TableCreationVisitor(), NO_OP));
				sql = sql.substring(0, sql.length() - 1) + ");";
				System.out.println("creation SQL is :\n" + sql);
				sql = "";
			}
			
		}
		private class TableCreationVisitor extends
			SimpleDeclarationVisitor{
			public void visitClassDeclaration(ClassDeclaration d){
				DBTable dbTable = d.getAnnotation(DBTable.class);
				if(dbTable != null) {
					sql += "CREATE TABLE";
					sql += (dbTable.name().length() < 1)
							? d.getSimpleName().toUpperCase()
							: dbTable.name();
					sql += " (";
				}
			}
		}
		
	}

}
*/